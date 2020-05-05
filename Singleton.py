class WHO:

    mainWHO = None
    cnt=0
    def __init__(self):
        WHO.cnt+=1
        if WHO.mainWHO!=None:
            raise Exception()
        else:
            WHO.mainWHO=self
            self.name=WHO.cnt

    @classmethod
    def get_instance(class_level):
        if WHO.mainWHO==None:
            WHO()
        return class_level.mainWHO
        

w1=WHO.get_instance()
print("w1",w1.name,w1)

w2=WHO.get_instance()
print("w2",w2.name,w2)


w2.name=8
print("w1",w1.name,w1)
print("w2",w2.name,w2)