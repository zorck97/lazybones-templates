def props = [:]

def date = new Date()
props.currentyear = date[Calendar.YEAR]
props.name = ask("What is your name? [Max Mustermann]: ", "Max Mustermann", "name")
props.nickname = ask("What is your Github/Gitlab nickname? [your-nickname]: ", "your-nickname", "nickname")
props.email = ask("What is your email? [your-email]: ", "your-email", "email")
props.projectname = ask("Define value for 'projectname' [projectname]: ", "projectname", "projectname")
props.version = ask("Define value for 'version' [v0.0.0]: ", "v0.0.0", "version")

processTemplates "VERSION.txt", props
processTemplates "LICENSE", props
processTemplates "Makefile", props
processTemplates "Dockerfile", props
processTemplates "README.md", props

"git init ${props.projectname}".execute()