Function X0Z8F04D04%()
    texturelodbias(opt\Field38)
    textureanisotropic(opt\Field60)
    Select opt\Field34
        Case $00
            texturedivisor($08)
        Case $01
            texturedivisor($04)
        Case $02
            texturedivisor($02)
        Case $03
            texturedivisor($01)
    End Select
    Return $00
End Function
