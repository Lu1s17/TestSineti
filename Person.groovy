import groovy.json.JsonOutput

def json = JsonOutput.toJson([name: 'Lionel', age: 30])
new File("person.json").write(json)

println JsonOutput.prettyPrint(json) 
