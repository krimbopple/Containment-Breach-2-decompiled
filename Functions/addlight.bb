Function addlight.lights(arg0.rooms, arg1#, arg2#, arg3#, arg4%, arg5#, arg6%, arg7%, arg8%, arg9%, arg10#, arg11%)
    Local local0.lights
    Local local1%
    Local local2%
    local0 = (New lights)
    local0\Field16 = arg0
    local0\Field0 = 90.0
    local0\Field7 = createpivot($00)
    positionentity(local0\Field7, arg1, arg2, arg3, $01)
    If (arg0 <> Null) Then
        entityparent(local0\Field7, arg0\Field15, $01)
    EndIf
    hideentity(local0\Field7)
    local0\Field5 = arg4
    arg6 = (Int ((Float arg6) * 2.1))
    arg7 = (Int ((Float arg7) * 2.1))
    arg8 = (Int ((Float arg8) * 2.1))
    local0\Field15 = (((Float ((arg6 + arg7) + arg8)) / 255.0) / 3.0)
    local0\Field20 = (Float arg6)
    local0\Field3 = (Float arg7)
    local0\Field18 = (Float arg8)
    local0\Field4 = arg5
    local0\Field6 = arg11
    If (arg0 <> Null) Then
        If (((rand($32, $01) = $01) And ((arg11 Lor arg9) = $00)) <> 0) Then
            local2 = arg0\Field22\Field21
            If (((((((local2 <> $04) And (local2 <> $4C)) And (local2 <> $4E)) And (local2 <> $72)) And (local2 <> $6F)) And (local2 <> $70)) <> 0) Then
                local0\Field10 = $01
            EndIf
        EndIf
    EndIf
    Return local0
    Return Null
End Function
