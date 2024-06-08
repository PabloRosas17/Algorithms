# Define the minimum CMake version required
cmake_minimum_required(VERSION 3.10)

# Set the project name
project(EclipseCpp)

# Set the source directory
set(SOURCE_DIR "${CMAKE_SOURCE_DIR}/${GITHUB_WORKSPACE}")

# Add the source directory to the include path
include_directories(${SOURCE_DIR})

# Create a library for Tools
add_library(Tools STATIC
    ${SOURCE_DIR}/Cpp/src/Tools/Tools.h
    ${SOURCE_DIR}/Cpp/src/Tools/ToolsDriver.cpp
    ${SOURCE_DIR}/Cpp/src/Tools/ToolsMain.cpp
)

# Add executable and specify source files
add_executable(aDsToolsMain
    ${SOURCE_DIR}/Cpp/src/Tools/Tools.h
    ${SOURCE_DIR}/Cpp/src/Tools/ToolsDriver.cpp
    ${SOURCE_DIR}/Cpp/src/Tools/ToolsMain.cpp
)

add_executable(aDsBstMain
    ${SOURCE_DIR}/Cpp/src/BinarySearchTree/BinarySearchTree.h
    ${SOURCE_DIR}/Cpp/src/BinarySearchTree/BinarySearchTreeDriver.cpp
    ${SOURCE_DIR}/Cpp/src/BinarySearchTree/BinarySearchTreeMain.cpp
    ${SOURCE_DIR}/Cpp/src/BinarySearchTree/BinarySearchTreeNode.h
)

add_executable(aDsHeapMain
    ${SOURCE_DIR}/Cpp/src/Heap/Heap.h
    ${SOURCE_DIR}/Cpp/src/Heap/HeapDriver.cpp
    ${SOURCE_DIR}/Cpp/src/Heap/HeapMain.cpp
)

add_executable(aDsLlMain
    ${SOURCE_DIR}/Cpp/src/LinkedList/LinkedList.h
    ${SOURCE_DIR}/Cpp/src/LinkedList/LinkedListDriver.cpp
    ${SOURCE_DIR}/Cpp/src/LinkedList/LinkedListMain.cpp
    ${SOURCE_DIR}/Cpp/src/LinkedList/LinkedListNode.h
)

add_executable(aDsQueueMain
    ${SOURCE_DIR}/Cpp/src/Queue/Queue.h
    ${SOURCE_DIR}/Cpp/src/Queue/QueueDriver.cpp
    ${SOURCE_DIR}/Cpp/src/Queue/QueueMain.cpp
)

add_executable(aDsStackMain
    ${SOURCE_DIR}/Cpp/src/Stack/Stack.h
    ${SOURCE_DIR}/Cpp/src/Stack/StackDriver.cpp
    ${SOURCE_DIR}/Cpp/src/Stack/StackMain.cpp
)

# Link the Tools library to executables that need it
target_link_libraries(aDsToolsMain PRIVATE Tools)
target_link_libraries(aDsQueueMain PRIVATE Tools)
target_link_libraries(aDsStackMain PRIVATE Tools)
