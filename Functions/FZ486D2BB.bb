Function FZ486D2BB%(arg0%)
    If (DZ64X028\Field18 <> Null) Then
        cameracullmode(arg0, $00)
        setbuffer(texturebuffer(T22FB2Z0B2, $00), XB0080D6B2(), $00)
        setbuffer(texturebuffer(TXZDB46B02X, $00), XB0080D6B2(), $01)
        setbuffer(texturebuffer(TDB84FBX46, $00), XB0080D6B2(), $02)
        setbuffer(texturebuffer(T20Z2020X22, $00), XB0080D6B2(), $03)
        showentity(DZ64X028\Field18\Field9)
        renderentity(arg0, TX20ZZFFX0Z, NAN)
        cameracullmode(arg0, $01)
        setbuffer(texturebuffer(T22FB2Z0B2, $00), XB0080D6B2(), $00)
        setbuffer($00, XB0080D6B2(), $01)
        setbuffer($00, XB0080D6B2(), $02)
        setbuffer($00, XB0080D6B2(), $03)
    EndIf
    Return $00
End Function
