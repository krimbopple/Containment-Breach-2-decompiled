Function XZ8F86B8D6%(arg0.items)
    Local local0.items
    For local0 = Each items
        If ((((local0 <> arg0) And (local0\Field17 = $00)) And (3.0 > entitydistancesquared(arg0\Field9, local0\Field9))) <> 0) Then
            entityactivate(local0\Field9, $01)
            local0\Field11 = 0.0
        EndIf
    Next
    Return $00
End Function
