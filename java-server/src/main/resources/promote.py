import os
import json

with open('promoters.json', 'r') as p, open('shelves.json', 'r') as s:
    
    promoters = json.load(p)['resources']
    shelves = json.load(s)['resources']


    print(promoters.keys())
    print(shelves.keys())
    assert set(promoters.keys()) == set(shelves.keys())

    promote_method = 'aws --profile lge-prod s3 cp {} {}'
    for key in promoters.keys():
        running = promote_method.format(promoters[key], shelves[key])
        print('running command: {}'.format(running))

        os.system(running)
