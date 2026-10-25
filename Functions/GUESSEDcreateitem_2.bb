Function GUESSEDcreateitem_2.itemtemplates(arg0$, arg1%, arg2%)
    Local local0.itemtemplates
    arg0 = lower(arg0)
    For local0 = Each itemtemplates
        If (((local0\Field23 = arg2) Lor ((lower(local0\Field19) = arg0) And (local0\Field9 = arg1))) <> 0) Then
            Return local0
        EndIf
    Next
    Return Null
    Return Null
End Function
