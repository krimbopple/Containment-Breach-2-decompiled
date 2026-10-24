Function X0D8ZZBB4F.rooms(arg0%, arg1%)
    Local local0.rooms
    If (arg1 <> 0) Then
        For local0 = Each rooms
            If (blitz_F24F084XB0(arg0, local0\Field12) <> 0) Then
                Return local0
            EndIf
        Next
    Else
        For local0 = Each rooms
            If (blitz_F24F084XB0(arg0, local0\Field31) <> 0) Then
                Return local0
            EndIf
        Next
    EndIf
    Return Null
    Return Null
End Function
