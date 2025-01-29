/* eslint-disable promise/no-nesting */

// Firebase SDKs for Cloud Functions and Realtime Database.
const functions = require('firebase-functions');
const firebase = require('firebase-admin');
firebase.initializeApp();

// Generate a function that will take some children data in a database and cloud messages send to devices.
// Following are unique generate this from your clients device:
//  DB_PATH is the path of the db. DEV_TKN is the device token in the db.
//  DB_TKN_ID is the token id in the db. DB_ACT_ID is the account id in the db.

exports.dbchangefx = functions.database
  .ref(`/${DB_PATH}/${DB_ACT_ID}/`)
  .onUpdate(async (change, context) => {
    try {
      // Fetch and Expand the data from reference.
      const { lat, lng, name } = (await firebase.database()
        .ref(`/${DB_PATH}/${DB_TKN_ID}/`)
        .once('value')).val();
      // Prepare the payload.
      const message = {
        data: {
          lat: lat.toString(),
          lng: lng.toString(),
          name: name.toString(),
        }
      };
      // Fire message to device.
      const response = await firebase.messaging().sendToDevice(DEV_TKN, message);
      console.log('Message sent successfully:', response);
    } catch (error) {
      console.error('Error during db update:', error);
    }
  });