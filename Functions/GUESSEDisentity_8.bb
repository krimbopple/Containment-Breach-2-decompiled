Function GUESSEDisentity_8.TX2BF6X0FF4(arg0%)
    Local local0#
    Local local1.TX2BF6X0FF4
    Local local2.TX2BF6X0FF4
    Local local3#
    local0 = 1000000.0
    local1 = Null
    local3 = 0.0
    For local2 = Each TX2BF6X0FF4
        If ((((((local2\Field52 <> $00) And (entityhidden(local2\Field52) = $00)) And (local2\Field12 = $00)) And local2\Field4) And (XXDB6F64F2[local2\Field3] <> Null)) <> 0) Then
            local3 = entitydistancesquared(local2\Field52, arg0)
            If (local0 > local3) Then
                local1 = local2
                local0 = local3
            EndIf
        EndIf
    Next
    Return local1
    Return Null
End Function
