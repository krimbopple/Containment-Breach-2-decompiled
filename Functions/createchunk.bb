Function createchunk.chunk(arg0.rooms, arg1%, arg2#, arg3#, arg4#, arg5%)
    Local local0.chunk
    Local local1.chunkpart
    Local local2%
    local0 = (New chunk)
    local0\Field0 = createpivot($00)
    positionentity(local0\Field0, (arg2 + 20.0), arg3, (arg4 + 20.0), $01)
    local0\Field2 = arg2
    local0\Field3 = arg3
    local0\Field7 = arg4
    local0\Field1 = arg5
    If (arg1 > $FFFFFFFF) Then
        local0\Field5 = TD0DFDZ4XX(TD4644B68Z(TX0Z2Z4F86D(D8XX4X0D0(scp1499chunks, arg1), "objects")))
        For local1 = Each chunkpart
            If (local1\Field3 = arg1) Then
                For local2 = $00 To (local0\Field5 - $01) Step $01
                    local0\Field4[local2] = copyentity(local1\Field2[local2], local0\Field0)
                Next
            EndIf
        Next
    EndIf
    local0\Field6 = copyentity(arg0\Field27[$00], local0\Field0)
    entitytype(local0\Field6, $01, $00)
    entitypickmode(local0\Field6, $02, $01)
    Return local0
    Return Null
End Function
