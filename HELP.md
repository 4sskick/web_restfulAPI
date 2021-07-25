# Getting Started

## DB Access

This project using Postgres, run along with docker to make it cleaner on system, make sure you already have it installed
& pull image. I'm using `postgres:12-alpine`.

Step:

- `docker-compose -f [docker_compose_file.yml] up -d`
- `docker container logs [container_name]`
- `docker exec -it [container_name] bash`
- `psql --username=[defined_on_yml_file] --password --dbname=[defined_on_yml_file]` then you're already on selected db
  you've chosen
- `\l`to see list db
- `\dt` to see tables

## Layer Application

This gonna be a simple layer application which using MVC as design architecture. You can see on
file `system-design.puml`. Make sure you already installed plugin `Plant UML` on intellij IDEA.
[![see here](system-design.puml)](system-design.puml)

- From user which gonna make a request, then accepted by `Controller`. It doesn't do a thing, only forwarding
  to `Service`.
- `Service` gonna do a business logic things then making request to `Repository`.
- `Repository` as bridge to make call with DB service. After Query data on DB service done, `Repository` has a
  callback with model data defined.
- Then forwarding back to `Service` continued to `Controller` which then making a feedback
  to user on what User requested