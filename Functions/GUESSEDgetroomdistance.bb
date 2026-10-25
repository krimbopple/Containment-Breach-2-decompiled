Function GUESSEDgetroomdistance#(arg0%, arg1.rooms)
    Local local0#
    Local local1#
    local0 = (Abs (arg1\Field40 - entityx(arg0, $01, 1.0)))
    local1 = (Abs (arg1\Field37 - entityz(arg0, $01, 1.0)))
    Return max(local0, local1)
    Return 0.0
End Function
