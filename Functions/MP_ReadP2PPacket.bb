Function MP_ReadP2PPacket$(arg0.T484FFBZX)
    Local local0%
    Local local1$
    local1 = _Steam_ReadP2PPacket(arg0\Field3, banksize(arg0\Field3), local0)
    arg0\Field2 = (Int min((Float local0), (Float banksize(arg0\Field3))))
    GUESSEDsetfield_15(arg0)
    Return local1
    Return ""
End Function
