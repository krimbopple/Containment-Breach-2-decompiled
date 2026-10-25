Function GUESSEDgetgetlocalstring_2$(arg0%)
    If (((arg0 = $FFFFFC18) Lor (arg0 = $00)) <> 0) Then
        Return getlocalstring("mpoptions", "auto")
    EndIf
    Return ((Str arg0) + " kb/s")
    Return ""
End Function
