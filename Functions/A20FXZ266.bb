Function A20FXZ266%(arg0%, arg1%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    local0 = countchildren(arg0)
    For local1 = $01 To local0 Step $01
        local2 = getchild(arg1, local1)
        local3 = getchild(arg0, local1)
        If (entityclass(local2) = "Mesh") Then
            entityinstance(local3, local2)
        EndIf
        A20FXZ266(local3, local2)
    Next
    Return $00
End Function
