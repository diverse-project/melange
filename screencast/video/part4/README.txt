/!\ The project is 1920x1200 60.00fps but other videos are in 1080p 25fps /!\

Tried in Kdenlive to change the Profile to HD 1080p 25 fps in the Project Setting.
It screws up the project :/

Workaround in command line:
ffmpeg -i untitled.mp4 -r 25 -vf scale=1920:1080 output2.mp4

