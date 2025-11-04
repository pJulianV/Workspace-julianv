# Count repeated numbers in list

def validar_repetidos(lista):
    dic_num = {}
    for i in lista:
        dic_num.update({i:0}) 
    
    for j in dic_num:
        
        for i in lista:
        
            if i == j:
                dic_num.update({i:+1})
    print(dic_num)

list_num = [4, 3, 2 , 4 , 1 ,3, 2]
validar_repetidos(list_num) 