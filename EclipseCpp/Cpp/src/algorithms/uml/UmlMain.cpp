
#include "UML.h"

int main() {
    std::cout << " * * * * * \n I'm going to show you about UML, the beautiful language of software engineering. \n * * * * *" << std::endl;
    std::string URL = "https://docs.microsoft.com/en-us/visualstudio/modeling/uml-class-diagrams-reference?view=vs-2015&redirectedfrom=MSDN";
    std::cout << "Show me how to make a small business that has a menu, can take orders at the store, and over the phone." << std::endl;
    std::cout << "You can find the diagram for this at " << URL << std::endl;

    UmlDriver driver;
    driver.order();

    return 0;
}