# Define the minimum CMake version required
cmake_minimum_required(VERSION 3.10)

# Set the project name
project(EclipseCpp)

# Set the source directory
set(SOURCE_DIR "${CMAKE_SOURCE_DIR}/${GITHUB_WORKSPACE}")

# Add the source directory to the include path
include_directories(${SOURCE_DIR})

# Create a library for Tools
#add_library(Tools STATIC
#    ${SOURCE_DIR}/Cpp/src/Tools/Tools.h
#    ${SOURCE_DIR}/Cpp/src/Tools/ToolsDriver.cpp
#    ${SOURCE_DIR}/Cpp/src/Tools/ToolsMain.cpp
#)

# Add executable and specify source files
#add_executable(aDsToolsMain
#    ${SOURCE_DIR}/Cpp/src/Tools/Tools.h
#    ${SOURCE_DIR}/Cpp/src/Tools/ToolsDriver.cpp
#    ${SOURCE_DIR}/Cpp/src/Tools/ToolsMain.cpp
#)

#add_executable(aDsSomeSrc
#    ${SOURCE_DIR}/Cpp/src/SomeSrc/SomeSrc.h
#    ${SOURCE_DIR}/Cpp/src/SomeSrc/SomeSrc.cpp
#    ${SOURCE_DIR}/Cpp/src/SomeSrc/SomeSrc.h
#)

# Link the Tools library to executables that need it
#target_link_libraries(aDsToolsMain PRIVATE Tools)
#target_link_libraries(aDsSomeSrc PRIVATE Tools)
