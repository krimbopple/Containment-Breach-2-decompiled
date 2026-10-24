Function createprop.props(arg0.rooms, arg1$, arg2#, arg3#, arg4#, arg5#, arg6#, arg7#, arg8#, arg9#, arg10#, arg11%, arg12%, arg13$, arg14#, arg15#, arg16#)
    Local local0.props
    Local local1%
    Local local2%
    Local local3%
    local0 = (New props)
    local0\Field0 = T2FB42464Z(arg1, arg13)
    local0\Field3 = arg1
    local0\Field5 = arg0
    local0\Field2 = arg13
    local0\Field4 = (arg1 = "GFX\Map\Props\water_cooler.b3d")
    local0\Field1 = (arg1 = "GFX\Map\Props\lamp_c.b3d")
    If (((arg0 <> Null) And (arg0\Field21 <> $00)) <> 0) Then
        local2 = createpivot($00)
        positionentity(local2, arg0\Field40, arg0\Field3, arg0\Field37, $00)
        local3 = createpivot(local2)
        positionentity(local3, arg2, arg3, arg4, $01)
        rotateentity(local3, arg5, arg6, arg7, $01)
        rotateentity(local2, 0.0, (Float arg0\Field21), 0.0, $00)
        arg2 = entityx(local3, $01, 1.0)
        arg3 = entityy(local3, $01, 1.0)
        arg4 = entityz(local3, $01, 1.0)
        arg6 = entityyaw(local3, $01, 1.0)
        freeentity(local3)
        freeentity(local2)
    EndIf
    positionentity(local0\Field0, arg2, arg3, arg4, $00)
    rotateentity(local0\Field0, arg5, arg6, arg7, $00)
    If (arg0 <> Null) Then
        entityparent(local0\Field0, arg0\Field15, $01)
    EndIf
    scaleentity(local0\Field0, arg8, arg9, arg10, $00)
    entitytype(local0\Field0, arg11, $00)
    entityfx(local0\Field0, arg12)
    entitypickmode(local0\Field0, $02, $01)
    entitycolor(local0\Field0, arg14, arg15, arg16)
    Return local0
    Return Null
End Function
