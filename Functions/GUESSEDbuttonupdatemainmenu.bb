Function GUESSEDbuttonupdatemainmenu.menubutton(arg0%, arg1%, arg2%, arg3%)
    Local local0.menubutton
    For local0 = Each menubutton
        If (((((local0\Field12 = arg0) And (local0\Field0 = arg1)) And (local0\Field7 = arg2)) And (local0\Field1 = arg3)) <> 0) Then
            Return local0
        EndIf
    Next
    Return Null
End Function
