# StockProfitCalculator

Simple project which using gradle which calculates the bestprofit that could have been made from single purchase and one sale of single stock.


## Prerequisites

**Install Gradle**
 *  **On Unix**

	$ sudo add-apt-repository ppa:cwchien/gradle
	$ sudo apt-get update
	$ sudo apt-get install gradle
	

*  	**On Mac OS X**
 
	 `brew install gradle`
[Install Homebrew](http://brew.sh/).
	

*   	**On Windows**
   
[Download from Gradle site](https://docs.gradle.org/current/userguide/installation.html).
	
	~~~
	:tasks
	------------------------------------------------------------
	All tasks runnable from root project
	------------------------------------------------------------
	Build tasks
	-----------
	assemble - Assembles the outputs of this project.
	build - Assembles and tests this project.
	buildDependents - Assembles and tests this project and all projects that depend on it.
	buildNeeded - Assembles and tests this project and all projects it depends on.
	classes - Assembles main classes.
	clean - Deletes the build directory.
	jar - Assembles a jar archive containing the main classes.
	testClasses - Assembles test classes.
	
	Build Setup tasks
	-----------------
	init - Initializes a new Gradle build.
	wrapper - Generates Gradle wrapper files.
	
	Documentation tasks
	-------------------
	javadoc - Generates Javadoc API documentation for the main source code.
	
	Help tasks
	----------
	buildEnvironment - Displays all buildscript dependencies declared in root project 'StockProfitCalculator'.
	components - Displays the components produced by root project 'StockProfitCalculator'. [incubating]
	dependencies - Displays all dependencies declared in root project 'StockProfitCalculator'.
	dependencyInsight - Displays the insight into a specific dependency in root project 'StockProfitCalculator'.
	dependentComponents - Displays the dependent components of components in root project 'StockProfitCalculator'. [incubating]
	help - Displays a help message.
	model - Displays the configuration model of root project 'StockProfitCalculator'. [incubating]
	projects - Displays the sub-projects of root project 'StockProfitCalculator'.
	properties - Displays the properties of root project 'StockProfitCalculator'.
	tasks - Displays the tasks runnable from root project 'StockProfitCalculator'.
	
	Verification tasks
	------------------
	check - Runs all checks.
	test - Runs the unit tests.
	
	Rules
	-----
	Pattern: clean<TaskName>: Cleans the output files of a task.
	Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
	Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.
	~~~

## Building and Testing
	
	gradle build
	

## Deployment

Jar containing the API's will be generated in build/libs/StockProfitCalculator.jar 
Include the jar api in your project classpath to start using the API


## Authors

* **Akshat Tandon** - *Initial work* - [Akshat's Github URL](https://github.com/akshattandon)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


