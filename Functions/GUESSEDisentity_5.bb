Function GUESSEDisentity_5%(arg0.TX2BF6X0FF4, arg1#, arg2%, arg3%)
    Local local0.TX2BF6X0FF4
    Local local1%
    Local local2%
    For local0 = Each TX2BF6X0FF4
        If (((local0\Field13 > $01) And (local0 <> arg0)) <> 0) Then
            local1 = ((arg3 > $00) And (arg3 = local0\Field46\Field31))
            local2 = (arg0\Field46\Field46 And local0\Field46\Field46)
            If ((((arg0\Field46\Field46 = $00) And ((arg1 > entitydistancesquared(local0\Field52, arg0\Field52)) Lor local1)) Lor local2) <> 0) Then
                GUESSEDbankfunc(local0\Field7, local0\Field25, arg0\Field13, arg2, (arg3 * local1), local2)
            EndIf
        EndIf
    Next
    Return $00
End Function
