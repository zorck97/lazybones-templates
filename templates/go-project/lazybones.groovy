def props = [:]

def date = new Date()
props.currentyear = date[Calendar.YEAR]
props.name = ask("What is your name? [Tim Becker]: ", "Tim Becker", "name")
props.nickname = ask("What is your Github/Gitlab nickname? [zorck97]: ", "zorck97", "nickname")
props.email = ask("What is your email? [timbckr@posteo.net]: ", "timbckr@posteo.net", "email")
props.projectname = ask("Define value for 'projectname' [projectname]: ", "projectname", "projectname")
props.version = ask("Define value for 'version' [v0.0.0]: ", "v0.0.0", "version")

processTemplates "VERSION.txt", props
processTemplates "LICENSE", props
processTemplates "Makefile", props
processTemplates "Dockerfile", props
processTemplates "README.md", props

"git init ${props.projectname}".execute()