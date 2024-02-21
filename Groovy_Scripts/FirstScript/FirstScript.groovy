println("\tMy first Groovy script\n")
println("\tList of directory 'etc'")
def process = "ls -l /etc".execute()
println(process.text)
println("Instead of 'execute text', you can work with 'new File'\n\n")
println(new File("/etc/passwd").text)