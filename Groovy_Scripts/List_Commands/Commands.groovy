println("\tCommands of Groovy\n")
println("List of All Credentials in your Jenkins: \n\n" + new File("${Jenkins.instance.root}/credentials.xml").text + "\n\n")
println("List of All Commands/Methods in Jenkins: \n\n" + (Jenkins.instance.metaClass.methods*.name))

def job = Jenkins.instance.getItemByFullName("YOUR JOB")
if (job != null) {
    job.getBuilds().each {
        println("Build ${it} Result: ${it.result}")
    }
} else {
    println("Job doesn't exist")
}