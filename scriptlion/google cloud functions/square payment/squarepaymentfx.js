// Import required APIs
const functions = require('firebase-functions');
const SquareConnect = require('square-connect');
const crypto = require('crypto');

// Constants for authentication and payment settings
const AUTH_TYPE = 'oauth2';
const PAYMENT_AMOUNT_CENTS = 100; // 1.00 USD
const CURRENCY = 'USD';

// Cloud Function to process payment using Square API
exports.squarepaymentfx = functions.https.onCall(async (data) => {
  try {
    // Initialize Square client and authenticate
    const defaultClient = SquareConnect.ApiClient.instance;
    defaultClient.basePath = process.env.TOKEN_SQUARE_CONNECT_URL;
    defaultClient.authentications[AUTH_TYPE].accessToken = process.env.TOKEN_APPLICATION_ACCESS_TOKEN;
    // Generate idempotency key and construct payment request
    const idempotencyKey = crypto.randomBytes(16).toString('hex');
    const paymentsApi = new SquareConnect.PaymentsApi();
    const requestBody = {
      idempotency_key: idempotencyKey,
      source_id: data.source_id,
      amount_money: {
        amount: PAYMENT_AMOUNT_CENTS,
        currency: CURRENCY,
      },
    };
    // Process payment and return success response
    const response = await paymentsApi.createPayment(requestBody);
    return `Payment successful: ${JSON.stringify(response)}`;
  } catch (error) {
    // Handle errors and return failure response
    return `Payment failed: ${error.message || error}`;
  }
});