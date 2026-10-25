Function GUESSEDrenderentity%(arg0%)
    If (DZ64X028\Field18 <> Null) Then
        cameracullmode(arg0, $00)
        setbuffer(texturebuffer(T22FB2Z0B2, $00), GUESSEDtexfunc(), $00)
        setbuffer(texturebuffer(TXZDB46B02X, $00), GUESSEDtexfunc(), $01)
        setbuffer(texturebuffer(TDB84FBX46, $00), GUESSEDtexfunc(), $02)
        setbuffer(texturebuffer(T20Z2020X22, $00), GUESSEDtexfunc(), $03)
        showentity(DZ64X028\Field18\Field9)
        renderentity(arg0, TX20ZZFFX0Z, NAN)
        cameracullmode(arg0, $01)
        setbuffer(texturebuffer(T22FB2Z0B2, $00), GUESSEDtexfunc(), $00)
        setbuffer($00, GUESSEDtexfunc(), $01)
        setbuffer($00, GUESSEDtexfunc(), $02)
        setbuffer($00, GUESSEDtexfunc(), $03)
    EndIf
    Return $00
End Function
