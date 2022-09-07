import math

def rotate(center, point, angle):

    xo, yo = point
    xc, yc = center

    x1 = ((xo-xc)*math.cos(math.radians(angle))) - ((yo-yc)*math.sin(math.radians(angle))) + xc
    y1 = ((xo-xc)*math.sin(math.radians(angle))) + ((yo-yc)*math.cos(math.radians(angle))) + yc
    
    
    return x1, y1



center=(0,0)
point=(0,8.5)
point2=(0,17)
point3=(0,35.5)

NewPointA=rotate(center,point,-40) #The rotate function rotates it by 10 degrees
print(NewPointA)

NewPointB=rotate(center,point2,-40) #The rotate function rotates it by 10 degrees
print(NewPointB)

NewPointC=rotate(center,point3,-40) #The rotate function rotates it by 10 degrees
print(NewPointC)




NewPointD=rotate(NewPointA,NewPointB,90) #The rotate function rotates it by 10 degrees
print(NewPointD)

NewPointE=rotate(NewPointA,NewPointC,90) #The rotate function rotates it by 10 degrees
print(NewPointE)




NewPointF=rotate(NewPointD,NewPointE,90) #The rotate function rotates it by 10 degrees
print(NewPointF)



