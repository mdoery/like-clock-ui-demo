#!/bin/sh

inotifywait -mr --timefmt '%d/%m/%y %H:%M' --format '%T %w %f' -e close_write /home/mdoery/StudioProjects/LikeClockUIDemo | while read date time dir file; do
    	filechanged=${dir}${file}
    	extension=${filechanged##*.}

    	if [ $extension = "apk" ]
       	then
	    	echo "At ${time} on ${date}, file $filechanged $extension"
		scp "$filechanged" mdoery@shenandoah.dreamhost.com:~/mdoery.com/A.apk
		fi
done
