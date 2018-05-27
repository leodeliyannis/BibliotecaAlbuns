# -*- coding: utf-8 -*-
# (C) Leonardo Deliyannis Constantin, Matheus Bianchi Godinho
# Cliente simples em Python 3 usando Zeep para consumir o webservice

from zeep import Client

class Album:
    def __init__(self):
        pass
        
def novoAlbum():
    ret = Album()
    ret.titulo = input('Digite o titulo do album: ')
    ret.artista = input('Digite o/a artista do album: ')
    ret.gravadora = input('Digite a gravadora do album: ')
    ret.ano = int(input('Digite o ano do album: '))
    return ret

def main():
    client = Client('http://localhost:9876/biblioteca?wsdl')
    print('### Biblioteca Musical ###')
    while True:
        print('\nMENU:')
        print('1) Inserir album')
        print('2) Listar albuns')
        print('0) Sair')
        op = input('> ')
        if op == '1':
            album = novoAlbum()
            client.service.insereAlbum(
                album.titulo, album.artista, album.gravadora, album.ano)
        elif op == '2':
            ls = client.service.retornaAlbuns()
            for album in ls:
                print('')
                print('Codigo:', album.codigo)
                print('Titulo:', album.titulo)
                print('Artista:', album.artista)
                print('Gravadora:', album.gravadora)
                print('Ano:', album.ano)
        elif op == '0':
            break
        else:
            print('Opcao invalida!')

if __name__ == '__main__':
    main()
