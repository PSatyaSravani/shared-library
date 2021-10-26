def call(Map abc) {
checkout
([$class: 'GitSCM', 
branches: [[name: abc.branch]], 
extensions: [], 
userRemoteConfigs: [[url: abc.url]]])

}
