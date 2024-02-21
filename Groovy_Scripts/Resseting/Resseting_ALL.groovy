println("\tResetting the Jenkins Build ALL Builds counter to zero\n")
def job = Jenkins.instance.getItemByFullName("YOUR JOB")
if (job != null) {
    job.getBuilds().each { build ->
        build.delete()
    }
} else {
    println("Job 'YOUR JOB' not found")
}