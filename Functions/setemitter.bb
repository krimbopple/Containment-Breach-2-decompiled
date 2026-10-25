Function setemitter.emitter(arg0.rooms, arg1#, arg2#, arg3#, arg4%)
    Local local0.emitter
    Local local1%
    Local local2%
    If ((((arg4 < $00) Lor (arg4 >= $FF)) Lor (particleeffect[arg4] = $00)) <> 0) Then
        Return Null
    EndIf
    local0 = (New emitter)
    local0\Field14 = arg0
    local0\Field11 = arg4
    local0\Field2 = createpivot($00)
    positionentity(local0\Field2, arg1, arg2, arg3, $00)
    If (arg0 <> Null) Then
        entityparent(local0\Field2, arg0\Field15, $01)
    EndIf
    local0\Field1 = createmesh($00)
    local0\Field6 = createsurface($00, $01)
    local0\Field3 = (Object.template particleeffect[arg4])
    local0\Field13 = (Float local0\Field3\Field4)
    entityblend(local0\Field1, local0\Field3\Field48)
    entityfx(local0\Field1, local0\Field3\Field42)
    If (local0\Field3\Field15 <> $00) Then
        entitytexture(local0\Field1, local0\Field3\Field15, $00, $00)
    EndIf
    local2 = $40
    If ((local0\Field3\Field42 And $01) <> 0) Then
        local2 = (local2 Or $20)
    EndIf
    If ((local0\Field3\Field42 And $08) <> 0) Then
        local2 = (local2 Or $400)
    EndIf
    GUESSEDcreatesurface(local0\Field1, $00, ($10000 Or local2))
    entitydestructor(local0\Field2, FuncPtr(X8F48ZZ8ZD))
    local0\Field0 = $00
    local0\Field0 = findfreeemitterid()
    local0\Field5 = 1.0
    Return local0
    Return Null
End Function
