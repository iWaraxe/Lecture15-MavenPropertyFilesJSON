// File: Ex06MavenLifecyclePhases.java
package com.coherentsolutions.java.webauto.section01;

/**
 * This class demonstrates the Maven build lifecycle phases.
 */
public class Ex06MavenLifecyclePhases {
    public static void main(String[] args) {
        System.out.println("Maven Build Lifecycle Phases:");
        System.out.println("1. clean - Deletes all compiled files in the target directory.");
        System.out.println("2. validate - Validates if all information is available for the project build.");
        System.out.println("3. compile - Compiles the source code files.");
        System.out.println("4. test - Runs the tests.");
        System.out.println("5. package - Packages the compiled code into a distributable format (e.g., JAR, WAR).");
        System.out.println("6. verify - Runs checks to verify the package is valid.");
        System.out.println("7. install - Installs the package into the local repository for use as a dependency in other projects.");
        System.out.println("8. site - Creates project documentation.");
        System.out.println("9. deploy - Copies the final package to a remote repository.");
    }
}
