#!/usr/bin/env python

import sys
import json
from clarifai.rest import ClarifaiApp

app = ClarifaiApp()

#ingreso por parametros ruta imagen
path = [sys.argv[1]]

#almacenamiento de JSON
data = app.tag_files(path)
data = json.dumps(data)

data = json.loads(data)

for i in range(0, len(data['outputs'][0]['data']['concepts'])):
	print data['outputs'][0]['data']['concepts'][i]['name'];
