#!/usr/bin/env python3

from cookiecutter.main import cookiecutter
import random

service_port = random.randint(10000,15000)

template_dir = '../cookiecutter-spring-boot-ms-template'
output_dir = '/tmp'
cookiecutter(
    template_dir,
    output_dir=output_dir,
    extra_context={'service_port': service_port}
)