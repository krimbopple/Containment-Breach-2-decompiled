Function GUESSEDcreateroom%(arg0.rooms)
    Local local0%
    For local0 = $01 To $FF Step $01
        If (XXDB6F64F2[local0] = Null) Then
            XXDB6F64F2[local0] = arg0
            arg0\Field1 = local0
            Exit
        EndIf
    Next
    Return $00
End Function
