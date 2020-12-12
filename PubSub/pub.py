import zmq
import os
import ntpath
from time import sleep

context = zmq.Context()
socket = context.socket(zmq.PUB)
socket.bind('tcp://127.0.0.1:2000')

dirname = input("Enter path name: ")
contents = os.listdir(dirname)
while(True):
    for c in contents:  
        print("Folder " + dirname + " has " + ntpath.basename(c))
        sleep(1)
        socket.send_pyobj("Folder " + dirname + " has " + ntpath.basename(c))

