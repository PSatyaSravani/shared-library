def call(String mvnaction) {
    
       if ("${mvnaction}" == "Clean")
                    {
                    bat "mvn clean"
                    }
              else if ("${mvnaction}" == "Compile")
                    {
                    bat "mvn clean compile"
                    }
               else if ("${mvnaction}" == "Test")
                    {
                    bat "mvn clean test"
                    }
                 else if ("${mvnaction}" == "Install")
                    {
                    bat "mvn clean install"
                    }
                 else if("${mvnaction}" == "Skip Test")
                    {
                    bat "mvn install -DskipTests=true"
                    }

}
