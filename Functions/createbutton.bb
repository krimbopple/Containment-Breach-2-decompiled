Function createbutton%(arg0%, arg1#, arg2#, arg3#, arg4#, arg5#, arg6#, arg7%, arg8%, arg9%)
    Local local0%
    local0 = $00
    If (arg9 <> 0) Then
        local0 = GUESSEDcopyentity_2(d_i\Field8[arg0], $00)
    Else
        local0 = copyentity(d_i\Field8[arg0], $00)
    EndIf
    scaleentity(local0, 0.03, 0.03, 0.03, $00)
    positionentity(local0, arg1, arg2, arg3, $00)
    rotateentity(local0, arg4, arg5, arg6, $00)
    entitypickmode(local0, $02, $01)
    If (arg8 <> 0) Then
        entitytexture(local0, d_i\Field1[$02], $00, $00)
        entityinstance(local0, getchild(d_i\Field11[arg0], $03))
    Else
        entitytexture(local0, d_i\Field1[$00], $00, $00)
        entityinstance(local0, getchild(d_i\Field11[arg0], $01))
    EndIf
    If (arg7 <> $00) Then
        entityparent(local0, arg7, $01)
    EndIf
    If (arg9 = $00) Then
        GUESSEDfreeentity_7(local0, $FFFFFFFF, $00)
        entityinstance(local0, $00)
    EndIf
    Return local0
    Return $00
End Function
