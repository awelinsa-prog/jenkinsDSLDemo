job('HelloWorld') {
    description('This job was created using Job DSL')

    steps {
        shell('echo "Hello from Jenkins Job DSL"')
    }
}
