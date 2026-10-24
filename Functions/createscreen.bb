Function createscreen.screens(arg0.rooms, arg1#, arg2#, arg3#, arg4#, arg5#, arg6#, arg7#, arg8#, arg9#, arg10$)
    Local local0.screens
    Local local1%
    local0 = (New screens)
    local0\Field10 = copyentity(misc_i\Field5, $00)
    positionentity(local0\Field10, arg1, arg2, arg3, $01)
    rotateentity(local0\Field10, arg4, arg5, arg6, $01)
    scaleentity(local0\Field10, arg7, arg8, arg9, $01)
    entitypickmode(local0\Field10, $02, $01)
    If (arg0 <> Null) Then
        entityparent(local0\Field10, arg0\Field15, $01)
    EndIf
    local0\Field7 = T80F88246X(arg10)
    local0\Field5 = $01
    local0\Field6 = ("GFX\Map\Screens\" + arg10)
    local0\Field12 = arg0
    YX2D2860X(local0\Field10, $00, $FFFFFFFF)
    XXX2B6864(local0)
    local0\Field11 = addlight(arg0, arg1, arg2, arg3, $03, 0.046875, $DC, $DC, $DC, $00, 0.0, $00)
    local0\Field11\Field0 = 140.0
    local0\Field11\Field17 = 0.0
    moveentity(local0\Field11\Field7, 0.0, 0.0, 0.005, $00)
    rotateentity(local0\Field11\Field7, arg4, arg5, arg6, $01)
    Return local0
    Return Null
End Function
