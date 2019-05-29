
##  - --  Lab 13 B  - --   ##

sentence = ""

try:
    file = open("words.txt","r")
    #print(filer)
    for x in file:
        for y in x.replace("\n", " "):
            sentence = sentence + y
            
    print(sentence)

    ofile = open("Sentence.txt","w")
    ofile.write(sentence)

finally:
    file.close()
    ofile.close()
