#!/bin/bash

dbs=(
    "collision4"
    "collision5"
    "dummy1"
    "dummy2"
    "dummy3"
    "dummy4"
    "oscillation2"
    "oscillation3"
    "oscillation4"
    "oscillation_test"
)


# Check command line arguments.
if [ -n "$1" ] ; then
    if [ $1 = "drop" ] ; then
        drop=true
    else
        dbs=("$@")
    fi
fi

for db in ${dbs[*]} ; do
    echo $dbs
    # Only go on if directory exists.
    if [ -d "$db" ] ; then
        mongo $db --eval "db.dropDatabase()"

        # Only go on if we are not just dropping databases.
        if [ ! "$drop" ] ; then
            mongorestore --db=$db --collection joint_states ./$db/joint_states.bson
            mongorestore --db=$db --collection l_arm_controller_state ./$db/l_arm_controller_state.bson
            mongorestore --db=$db --collection r_arm_controller_state ./$db/r_arm_controller_state.bson
        fi
    fi
done

# Link and joint descriptions are independent from the states.
mongo pr2 --eval "db.dropDatabase()"
if [ ! "$drop" ] ; then
    mongorestore --db=pr2 --collection robot_joints ./pr2/robot_joints.bson
    mongorestore --db=pr2 --collection robot_links ./pr2/robot_links.bson
fi

