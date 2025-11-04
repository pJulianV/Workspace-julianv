print("welcome")
print("Your goal is to find the trasure")

value = input("You're at a cross road, Where do you wnat to go ? Type (left or right)")



while True:
    #After Cross Road
    if value.lower() == 'left':
        after_lake = input("There is a lake in front of you and you could: (swim or wait ), what are youy going to do?")

    elif value.lower() == 'right':
        print("You find a pack o wolves, they bite you until you stop moving (GAME OVER)")
        break
    else:
        print("you choose to do nothing, and die of starving (GAME OVER)")
        break

    #After Lake
    if after_lake.lower() == 'swim':
        after_doors = input("There is tree doors (blue, red and white ), wich one do you choose ")

    elif after_lake.lower() == 'wait':
        print("While you're waitng a p ack o wolves find you , they bite you, until you stop moving (GAME OVER)")
        break
    else:
        print("you choose to do nothing, and die of starving (GAME OVER)")
        break
    #After Doors
    if after_doors.lower() == 'blue':
        print("You enter a room with a lot of water. It is dark. You go further into it, and then a crocodile jumps and rips off your head. (GAME OVER)")
        break
    elif after_doors.lower() == 'red':
        print("You enter a room, It is dark. You go further into it, the heatof the room rise up, the a jet o fire full the room   (GAME OVER)")
        break
    elif after_doors.lower() == 'white':
        print("You enter a room in a lot of light.  it's almost blid you , and there it is a chest, inside  of it you find a note that says (The real treasure is the frinens that you make in your jorney) ")
        print("Thanks for playing")
        
        break

    else:
        print("you choose to do nothing, and die of starving")
        break

