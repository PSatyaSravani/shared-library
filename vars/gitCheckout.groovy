def call(Map abc) {

    checkout([
        $class: 'GitSCM',
        branches: [[name:  abc.branch ]],
        userRemoteConfigs: [[ url: abc.url ]]
    ])
  }
