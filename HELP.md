#Getting Started

##DB Access
this project using Postgres, run along with docker to make it cleaner on system, make sure you already have it installed & pull image. I'm using `postgres:12-alpine`.

Step:
- `docker-compose -f [docker_compose_file.yml] up -d`
- `docker container logs [container_name]`
- `docker exec -it [container_name] bash`
- `psql --username=[defined_on_yml_file] --password --dbname=[defined_on_yml_file]` then you're already on selected db you've chosen
- `\l`to see list db
- `\dt` to see tables