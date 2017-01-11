from clarifai.rest import ClarifaiApp

app = ClarifaiApp()

app.tag_urls(urls=['https://samples.clarifai.com/wedding.jpg'], model='travel-v1.0')
