Function loadmissingtexture%()
    missingtexture = createtexture($01, $01, $01, $01)
    setbuffer(texturebuffer(missingtexture, $00), $00, $00)
    clscolor($00, $00, $00, $FF)
    cls()
    setbuffer(backbuffer(), $00, $00)
    Return $00
End Function
