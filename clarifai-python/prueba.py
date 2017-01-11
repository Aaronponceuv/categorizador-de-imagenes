from clarifai.rest import ClarifaiApp

app = ClarifaiApp()
print (app.tag_urls(['https://samples.clarifai.com/metro-north.jpg']))
